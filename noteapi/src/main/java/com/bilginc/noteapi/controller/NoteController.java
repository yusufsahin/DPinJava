package com.bilginc.noteapi.controller;

import com.bilginc.noteapi.dto.NoteDto;
import com.bilginc.noteapi.service.impl.NoteServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("api/notes")
@Slf4j
@CrossOrigin
@NoArgsConstructor
@AllArgsConstructor
public class NoteController {

    @Autowired
    private NoteServiceImpl noteServiceImpl;

    @GetMapping()
    public ResponseEntity<List<NoteDto>> getAll(){
        List<NoteDto> data= noteServiceImpl.getNotes();
        return  ResponseEntity.ok(data);
    }

    @GetMapping("/{id}")
    public ResponseEntity<NoteDto> getById(@PathVariable(value = "id",required = true)Long id)
    {
        try{
            NoteDto noteDto= noteServiceImpl.getById(id);
            return  ResponseEntity.ok(noteDto);
        }catch (Exception e)
        {
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping()
    public  ResponseEntity<NoteDto> createNote(@Valid @RequestBody NoteDto noteDto){
        try{
            NoteDto newNote= noteServiceImpl.save(noteDto);
            return ResponseEntity.created(new URI("/api/notes/"+newNote.getId())).body(newNote);
        }catch (Exception e)
        {
            return  ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<NoteDto> updateNote(@PathVariable(value = "id",required = true) Long id,@Valid @RequestBody NoteDto noteDto)
    {
        try
        {
            noteServiceImpl.update(id,noteDto);
            return ResponseEntity.noContent().build();
        }catch (Exception e)
        {
            return  ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable(value = "id",required = true) Long id)
    {
        try {
            if(id!=null)
            {

                noteServiceImpl.delete(id);
                return ResponseEntity.noContent().build();
            }
            else
            {
                return ResponseEntity.badRequest().build();
            }
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }



    }

}

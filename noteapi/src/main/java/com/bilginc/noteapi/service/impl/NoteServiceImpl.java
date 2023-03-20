package com.bilginc.noteapi.service.impl;

import com.bilginc.noteapi.dao.NoteRepository;
import com.bilginc.noteapi.dao.entity.Note;
import com.bilginc.noteapi.dto.NoteDto;
import com.bilginc.noteapi.service.NoteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public NoteDto save(NoteDto noteDto) {

        Note n = modelMapper.map(noteDto,Note.class);
        n= noteRepository.save(n);
        noteDto.setId(n.getId());
        return noteDto;
    }

    @Override
    public NoteDto getById(Long id) {

        Optional<Note> n= noteRepository.findById(id);

        return modelMapper.map(n.get(),NoteDto.class);
    }

    @Override
    public List<NoteDto> getNotes() {
        List<Note> data= noteRepository.findAll();
        return Arrays.asList(modelMapper.map(data,NoteDto[].class));
    }

    @Override
    public void delete(Long id) {

        noteRepository.deleteById(id);

    }

    @Transactional
    @Override
    public NoteDto update(Long id, NoteDto noteDto) {

        Note noteDb= noteRepository.findById(id).get();
        if (noteDb == null)
            throw new IllegalArgumentException("Note Does Not Exist ID:" + id);

        noteDb.setName(noteDto.getName());
        noteDb.setDescription(noteDto.getDescription());
        noteRepository.save(noteDb);

        return modelMapper.map(noteDb,NoteDto.class);
    }
}

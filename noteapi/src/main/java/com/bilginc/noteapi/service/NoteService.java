package com.bilginc.noteapi.service;

import com.bilginc.noteapi.dto.NoteDto;

import java.util.List;

public interface NoteService {
    NoteDto save(NoteDto noteDto);
    NoteDto getById(Long id);

    List<NoteDto> getNotes();

    void delete(Long id);

    NoteDto update(Long id,NoteDto noteDto);
}

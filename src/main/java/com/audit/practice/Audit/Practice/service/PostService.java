package com.audit.practice.Audit.Practice.service;

import com.audit.practice.Audit.Practice.dto.UploadPostDto;

public interface PostService {

    UploadPostDto createPost (UploadPostDto uploadPostDto);
    UploadPostDto updatePost (UploadPostDto uploadPostDto, Long postId);

}

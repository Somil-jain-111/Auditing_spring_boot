package com.audit.practice.Audit.Practice.service.Impl;

import com.audit.practice.Audit.Practice.dto.UploadPostDto;
import com.audit.practice.Audit.Practice.entities.PostEntity;
import com.audit.practice.Audit.Practice.respository.PostRepository;
import com.audit.practice.Audit.Practice.service.PostService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class PostServiceImpl implements PostService {

    private final ModelMapper modelMapper;
    private  final PostRepository postRepository;

    public PostServiceImpl(ModelMapper modelMapper, PostRepository postRepository) {
        this.modelMapper = modelMapper;
        this.postRepository = postRepository;
    }


    @Override
    public UploadPostDto createPost(UploadPostDto uploadPostDto) {
        PostEntity postEntity = modelMapper.map(uploadPostDto,PostEntity.class);
        PostEntity savePost = postRepository.save(postEntity);
        return modelMapper.map(savePost,UploadPostDto.class);
    }

    @Override
    public UploadPostDto updatePost(UploadPostDto inputPost, Long postId) {
        PostEntity olderPost = postRepository.findById(postId).orElseThrow(() -> new EntityNotFoundException("Post with id " + postId + " not found."));
        inputPost.setId(postId);
        modelMapper.map(inputPost,olderPost);
        PostEntity saveUpdatePost = postRepository.save(olderPost);
        return modelMapper.map(saveUpdatePost,UploadPostDto.class);
    }
}

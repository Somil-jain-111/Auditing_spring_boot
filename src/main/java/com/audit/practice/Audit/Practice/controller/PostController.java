package com.audit.practice.Audit.Practice.controller;


import com.audit.practice.Audit.Practice.dto.UploadPostDto;
import com.audit.practice.Audit.Practice.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
public class PostController {

    private  final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping()
    public ResponseEntity<String>  create(){
     ;
        return ResponseEntity.ok("ssssssssssss") ;
    }

    @PostMapping("/upload")
  public ResponseEntity<UploadPostDto>  createPost(@RequestBody UploadPostDto uploadPost){
        return ResponseEntity.ok(postService.createPost(uploadPost)) ;
    }


    @PutMapping("{postId}")
    public ResponseEntity<UploadPostDto>  updatePost(@RequestBody UploadPostDto inputPost,@PathVariable Long postId ){
        return ResponseEntity.ok(postService.updatePost(inputPost,postId)) ;
    }

}

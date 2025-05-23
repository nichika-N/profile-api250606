package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Profile;

@RestController
@CrossOrigin(origins = "*")  // Reactから呼び出す用
public class ProfileController {
    @GetMapping("/api/profile")
    public Profile getProfile() {
        return new Profile(
            "中村 日知花",
            "株式会社リアルインベント",
            "Javaを学びながら、ReactとTailwindCSSを使ってこのポートフォリオを作成しました。"
        );
    }
}
package com.example.securing_web;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
// Đây là một giao diện kho lưu trữ người dùng sử dụng Spring Data JPA để truy xuất dữ liệu người dùng từ cơ sở dữ liệu.
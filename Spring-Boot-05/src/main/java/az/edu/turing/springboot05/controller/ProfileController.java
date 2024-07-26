package az.edu.turing.springboot05.controller;

import az.edu.turing.springboot05.model.request.ImageRequest;
import az.edu.turing.springboot05.model.request.ProfileRequest;
import az.edu.turing.springboot05.model.response.ProfileResponse;
import az.edu.turing.springboot05.service.ProfileService;
import jakarta.validation.Valid;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/profiles")
public class ProfileController {
    ProfileService profileService;

    @GetMapping
    public ResponseEntity<List<ProfileResponse>> getAllProfiles() {
        return ResponseEntity.ok(profileService.getAllProfiles());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfileResponse> getProfileById(@PathVariable @NonNull Long id) {
        return ResponseEntity.ok(profileService.getProfile(id));
    }

    @PostMapping
    public ResponseEntity<ProfileResponse> createProfile(@RequestBody @Valid ProfileRequest profileRequest) {
        return new ResponseEntity<>(profileService.createProfile(profileRequest), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<ProfileResponse> updateProfile(@PathVariable @NonNull Long id, @RequestBody @Valid ProfileRequest profileRequest) {
        return ResponseEntity.ok(profileService.updateProfile(id, profileRequest));
    }

    @PatchMapping("{id}")
    public ResponseEntity<Void> updateImage(@PathVariable @NonNull Long id, @RequestBody @Valid ImageRequest imageRequest) {
        profileService.updateImage(id, imageRequest);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteProfile(@PathVariable @NonNull Long id) {
        profileService.deleteProfile(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countProfiles() {
        return ResponseEntity.ok(profileService.countProfiles());
    }
}

package az.edu.turing.springboot05.service;

import az.edu.turing.springboot05.model.request.ImageRequest;
import az.edu.turing.springboot05.model.request.ProfileRequest;
import az.edu.turing.springboot05.model.response.ProfileResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfileService {
    ProfileResponse createProfile(ProfileRequest profileRequest);
    ProfileResponse getProfile(Long id);
    List<ProfileResponse> getAllProfiles();
    ProfileResponse updateProfile(Long id,ProfileRequest profileRequest);
    void updateImage(Long id,ImageRequest imageRequest);
    void deleteProfile(Long id);
    void deleteAllProfiles();
    Long countProfiles();
}

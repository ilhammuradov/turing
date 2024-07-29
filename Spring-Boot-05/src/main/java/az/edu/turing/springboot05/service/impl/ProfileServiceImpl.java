package az.edu.turing.springboot05.service.impl;

import az.edu.turing.springboot05.domain.repository.ProfileRepository;
import az.edu.turing.springboot05.exception.ProfileNotFoundException;
import az.edu.turing.springboot05.mapper.ProfileMapper;
import az.edu.turing.springboot05.model.request.ImageRequest;
import az.edu.turing.springboot05.model.request.ProfileRequest;
import az.edu.turing.springboot05.model.response.ProfileResponse;
import az.edu.turing.springboot05.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {
    private final ProfileRepository profileRepository;
    private final ProfileMapper profileMapper;

    @Override
    public ProfileResponse createProfile(ProfileRequest profileRequest) {
        return profileMapper.toProfileResponse(
                profileRepository.save(
                        profileMapper.toProfile(profileRequest)));
    }

    @Override
    public ProfileResponse getProfile(Long id) {
        return profileRepository.findById(id)
                .map(profileMapper::toProfileResponse)
                .orElseThrow(ProfileNotFoundException::new);
    }

    @Override
    public List<ProfileResponse> getAllProfiles() {
        return profileMapper.toProfileResponseList(profileRepository.findAll());
    }

    @Override
    public ProfileResponse updateProfile(Long id,ProfileRequest profileRequest) {
       return profileRepository.findById(id)
               .map(profile -> {
                    profile.setName(profileRequest.name());
                    profile.setAge(profileRequest.age());
                    profile.setImage(profileRequest.image());

                    return profileMapper.toProfileResponse(profileRepository.save(profile));
        }).
               orElseThrow(ProfileNotFoundException::new);
    }

    @Override
    public void updateImage(Long id,ImageRequest imageRequest) {
        profileRepository.findById(id)
                .map(profile -> {
                    profile.setImage(imageRequest.image());
                    return profileRepository.save(profile);
                })
                .orElseThrow(ProfileNotFoundException::new);
    }

    @Override
    public void deleteProfile(Long id) {
        if (profileRepository.existsById(id)) {
            profileRepository.deleteById(id);
        }else {
            throw new ProfileNotFoundException();
        }
    }

    @Override
    public void deleteAllProfiles() {
        profileRepository.deleteAll();
    }

    @Override
    public Long countProfiles() {
        return profileRepository.count();
    }
}

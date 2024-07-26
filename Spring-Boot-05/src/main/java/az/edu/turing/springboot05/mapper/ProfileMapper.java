package az.edu.turing.springboot05.mapper;

import az.edu.turing.springboot05.domain.entity.Profile;
import az.edu.turing.springboot05.model.request.ProfileRequest;
import az.edu.turing.springboot05.model.response.ProfileResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    Profile toProfile(ProfileRequest profileRequest);

    ProfileResponse toProfileResponse(Profile profile);

    List<ProfileResponse> toProfileResponseList(List<Profile> profileList);
}

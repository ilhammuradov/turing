package az.edu.turing.springboot04;

import lombok.Data;

@Data
public class ImageUploadDto {
    private String base64Image;

    public String getBase64Image() {
        return base64Image;
    }

    public void setBase64Image(String base64Image) {
        this.base64Image = base64Image;
    }
}

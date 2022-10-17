package br.com.fiap.accessiblemealapi.DTO;

import org.apache.commons.codec.binary.Base64;

import br.com.fiap.accessiblemealapi.model.Restaurante;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestauranteDTO {
    /*name: string;
    email: string;
    typePCD: ['visual', 'motora', 'mental', 'auditiva'];
    menu: base64;
    adress: string;
    profilePicture: base64;*/

    private Long id;
    private String name;
    private String email;
    private String typePCD;
    private String menu;
    private String address;
    private String profilePicture;

    public static Restaurante toModel(RestauranteDTO dto) {
        byte[] decodedMenu = Base64.decodeBase64(dto.getMenu());
        byte[] decodedProfilePicture = Base64.decodeBase64(dto.getProfilePicture());

        return Restaurante.builder()
        .id(dto.getId())
        .name(dto.getName())
        .email(dto.getEmail())
        .typePCD(dto.getTypePCD())
        .menu(decodedMenu)
        .address(dto.getAddress())
        .profilePicture(decodedProfilePicture)
        .build();
    }

    public static RestauranteDTO toDTO(Restaurante restaurante) {
        String encodedMenu = Base64.encodeBase64String(restaurante.getMenu());
        String encodedProfilePicture = Base64.encodeBase64String(restaurante.getProfilePicture());

        return RestauranteDTO.builder()
        .id(restaurante.getId())
        .name(restaurante.getName())
        .email(restaurante.getEmail())
        .typePCD(restaurante.getTypePCD())
        .menu(encodedMenu)
        .address(restaurante.getAddress())
        .profilePicture(encodedProfilePicture)
        .build();
    }
}

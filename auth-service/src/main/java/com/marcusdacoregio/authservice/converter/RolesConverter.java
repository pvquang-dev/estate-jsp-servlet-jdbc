package com.marcusdacoregio.authservice.converter;

import java.util.stream.Stream;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.marcusdacoregio.authservice.enums.RolesEnum;


@Converter(autoApply = true)
public class RolesConverter implements AttributeConverter<RolesEnum, String> {

	@Override
	public String convertToDatabaseColumn(RolesEnum role) {
		if (role == null) {
            return null;
        }
        return role.getType();
	}

	@Override
	public RolesEnum convertToEntityAttribute(String type) {
		if (type == null) {
			return null;
		}

		return Stream.of(RolesEnum.values()).filter(c -> c.getType().equals(type)).findFirst()
				.orElseThrow(IllegalArgumentException::new);
	}	

}

package com.thecoders.cartunnbackend.iam.interfaces.rest.resources;

import java.util.List;

public record UpdateUserResource(String username, String password, List<String> roles) {
}

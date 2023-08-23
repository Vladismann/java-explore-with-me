package ru.practicum.dto.Common;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Messages {

    public static final String RECEIVED_GET = "Получен запрос GET {}/{}";
    public static final String RECEIVED_POST = "Получен запрос POST {}/{}";
    public static final String RECEIVED_PATCH = "Получен запрос PATCH {}/{}";
    public static final String RECEIVED_DELETE = "Получен запрос DELETE {}/{}";
}

# Session Session API Specification

---

## Public endpoints

### GET /session/by-project/{project_id}
- Mô tả: Get Session By Project (Active) theo `project_id`
- Auth: không

- Response 200 (object `v1SessionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "current_feature_id": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### POST /session/create
- Mô tả: Create Session
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "project_id": "..."
  }
}
```

- Response 200 (object `v1SessionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "current_feature_id": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### PUT /session/update
- Mô tả: Update Session
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "signature": {
    "s_type": "...",
    "s": "...",
    "b": "..."
  },
  "payload": {
    "id": "...",
    "current_feature_id": "...",
    "status": "..."
  }
}
```

- Response 200 (object `v1SessionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "current_feature_id": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

### GET /session/{id}
- Mô tả: Get Session theo `id`
- Auth: không

- Response 200 (object `v1SessionReply`):

```json
{
  "result": {
    "code": "...",
    "message": "..."
  },
  "payload": {
    "id": "...",
    "project_id": "...",
    "current_feature_id": "...",
    "status": "...",
    "created_at": "...",
    "updated_at": "..."
  }
}
```

- Response default: An unexpected error response.

```json
{
  "code": 1000,
  "message": "...",
  "details": [
    {
      "@type": "..."
    }
  ]
}
```

---

## Notes chung / Behaviour
- Server sử dụng in-memory stores (maps) cho dữ liệu. Dữ liệu sẽ mất khi server dừng.
- Một vài sample data có thể được seed sẵn để test.

---

End of spec.

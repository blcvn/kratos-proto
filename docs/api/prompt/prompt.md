# Prompt Prompt API Specification

---

## Public endpoints

### POST /prompts/experiments
- Mô tả: Experiment Management
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
    "name": "...",
    "template_a_id": "...",
    "template_b_id": "...",
    "traffic_split": 1000
  }
}
```

- Response 200 (object `v1CreateExperimentResponse`):

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
  "result": {
    "code": "...",
    "message": "..."
  },
  "experiment": {
    "id": "...",
    "name": "...",
    "template_a_id": "...",
    "template_b_id": "...",
    "traffic_split": 1000,
    "metrics": {},
    "status": "...",
    "winner_id": "...",
    "created_at": "2025-...",
    "completed_at": "2025-..."
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

### GET /prompts/experiments/{id}
- Mô tả: Lấy thông tin theo `id`
- Auth: không

- Response 200 (object `v1GetExperimentResponse`):

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
  "result": {
    "code": "...",
    "message": "..."
  },
  "experiment": {
    "id": "...",
    "name": "...",
    "template_a_id": "...",
    "template_b_id": "...",
    "traffic_split": 1000,
    "metrics": {},
    "status": "...",
    "winner_id": "...",
    "created_at": "2025-...",
    "completed_at": "2025-..."
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

### POST /prompts/experiments/{id}/complete
- Mô tả: Gửi yêu cầu theo `id`
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
    "winner_id": "..."
  }
}
```

- Response 200 (object `v1CompleteExperimentResponse`):

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
  "result": {
    "code": "...",
    "message": "..."
  },
  "experiment": {
    "id": "...",
    "name": "...",
    "template_a_id": "...",
    "template_b_id": "...",
    "traffic_split": 1000,
    "metrics": {},
    "status": "...",
    "winner_id": "...",
    "created_at": "2025-...",
    "completed_at": "2025-..."
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

### POST /prompts/render
- Mô tả: Template Rendering
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
    "template_id": "...",
    "variables": {}
  }
}
```

- Response 200 (object `v1RenderTemplateResponse`):

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
  "result": {
    "code": "...",
    "message": "..."
  },
  "rendered": {
    "template_id": "...",
    "rendered_text": "...",
    "variables_used": {},
    "version_used": "..."
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

### GET /prompts/templates
- Mô tả: Lấy thông tin
- Auth: không

- Response 200 (object `v1ListTemplatesResponse`):

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
  "result": {
    "code": "...",
    "message": "..."
  },
  "templates": [
    {
      "id": "...",
      "name": "...",
      "version": "...",
      "environment": "...",
      "template": "...",
      "variables": [
        {
          "name": "...",
          "type": "...",
          "description": "...",
          "default_value": "...",
          "required": true
        }
      ],
      "metadata": {},
      "status": "...",
      "created_by": "...",
      "created_at": "2025-...",
      "updated_at": "2025-..."
    }
  ],
  "total": 1000
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

### POST /prompts/templates
- Mô tả: Template Management
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
    "name": "...",
    "version": "...",
    "environment": "...",
    "template": "...",
    "variables": [
      {
        "name": "...",
        "type": "...",
        "description": "...",
        "default_value": "...",
        "required": true
      }
    ],
    "metadata": {}
  }
}
```

- Response 200 (object `v1CreateTemplateResponse`):

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
  "result": {
    "code": "...",
    "message": "..."
  },
  "template": {
    "id": "...",
    "name": "...",
    "version": "...",
    "environment": "...",
    "template": "...",
    "variables": [
      {
        "name": "...",
        "type": "...",
        "description": "...",
        "default_value": "...",
        "required": true
      }
    ],
    "metadata": {},
    "status": "...",
    "created_by": "...",
    "created_at": "2025-...",
    "updated_at": "2025-..."
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

### DELETE /prompts/templates/{id}
- Mô tả: Xóa theo `id`
- Auth: không

- Response 200 (object `v1ResponseEmpty`):

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
  "result": {
    "code": "...",
    "message": "..."
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

### GET /prompts/templates/{id}
- Mô tả: Lấy thông tin theo `id`
- Auth: không

- Response 200 (object `v1GetTemplateResponse`):

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
  "result": {
    "code": "...",
    "message": "..."
  },
  "template": {
    "id": "...",
    "name": "...",
    "version": "...",
    "environment": "...",
    "template": "...",
    "variables": [
      {
        "name": "...",
        "type": "...",
        "description": "...",
        "default_value": "...",
        "required": true
      }
    ],
    "metadata": {},
    "status": "...",
    "created_by": "...",
    "created_at": "2025-...",
    "updated_at": "2025-..."
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

### PUT /prompts/templates/{payload.id}
- Mô tả: Cập nhật theo `payload.id`
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
    "template": "...",
    "variables": [
      {
        "name": "...",
        "type": "...",
        "description": "...",
        "default_value": "...",
        "required": true
      }
    ],
    "status": "..."
  }
}
```

- Response 200 (object `v1UpdateTemplateResponse`):

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
  "result": {
    "code": "...",
    "message": "..."
  },
  "model": {
    "id": "...",
    "name": "...",
    "version": "...",
    "environment": "...",
    "template": "...",
    "variables": [
      {
        "name": "...",
        "type": "...",
        "description": "...",
        "default_value": "...",
        "required": true
      }
    ],
    "metadata": {},
    "status": "...",
    "created_by": "...",
    "created_at": "2025-...",
    "updated_at": "2025-..."
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

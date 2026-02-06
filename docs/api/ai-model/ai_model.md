# Ai-Model Ai_Model API Specification

---

## Public endpoints

### GET /ai/models
- Mô tả: Lấy thông tin
- Auth: không

- Response 200 (object `v1ListModelsResponse`):

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
  "models": [
    {
      "id": "...",
      "name": "...",
      "provider": "...",
      "model_id": "...",
      "base_url": "...",
      "config": {},
      "quota_daily": "...",
      "quota_monthly": "...",
      "cost_per_1k_tokens": 1000.0,
      "status": "...",
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

### POST /ai/models
- Mô tả: Model Management (Admin APIs)
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
    "provider": "...",
    "model_id": "...",
    "base_url": "...",
    "api_key": "...",
    "config": {},
    "quota_daily": "...",
    "quota_monthly": "...",
    "cost_per_1k_tokens": 1000.0
  }
}
```

- Response 200 (object `v1CreateModelResponse`):

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
    "provider": "...",
    "model_id": "...",
    "base_url": "...",
    "config": {},
    "quota_daily": "...",
    "quota_monthly": "...",
    "cost_per_1k_tokens": 1000.0,
    "status": "...",
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

### GET /ai/models/stats
- Mô tả: Analytics
- Auth: không

- Response 200 (object `v1GetUsageStatsResponse`):

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
  "stats": [
    {
      "model_id": "...",
      "model_name": "...",
      "total_requests": "...",
      "total_tokens": "...",
      "total_cost": 1000.0,
      "avg_latency_ms": 1000,
      "success_rate": 1000.0
    }
  ]
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

### DELETE /ai/models/{id}
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

### GET /ai/models/{id}
- Mô tả: Lấy thông tin theo `id`
- Auth: không

- Response 200 (object `v1GetModelResponse`):

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
    "provider": "...",
    "model_id": "...",
    "base_url": "...",
    "config": {},
    "quota_daily": "...",
    "quota_monthly": "...",
    "cost_per_1k_tokens": 1000.0,
    "status": "...",
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

### PUT /ai/models/{payload.id}
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
    "name": "...",
    "config": {},
    "quota_daily": "...",
    "quota_monthly": "...",
    "status": "..."
  }
}
```

- Response 200 (object `v1UpdateModelResponse`):

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
    "provider": "...",
    "model_id": "...",
    "base_url": "...",
    "config": {},
    "quota_daily": "...",
    "quota_monthly": "...",
    "cost_per_1k_tokens": 1000.0,
    "status": "...",
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

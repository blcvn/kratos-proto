# Ai-Proxy Ai_Proxy API Specification

---

## Public endpoints

### POST /ai/complete
- Mô tả: Completion APIs
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
    "model_id": "...",
    "prompt": "...",
    "messages": [
      {
        "role": "...",
        "content": "..."
      }
    ],
    "max_tokens": 1000,
    "temperature": 1000.0,
    "top_p": 1000.0,
    "stop": [
      "..."
    ],
    "stream": true
  }
}
```

- Response 200 (object `v1CompleteResponse`):

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
  "completion": {
    "id": "...",
    "model_id": "...",
    "text": "...",
    "prompt_tokens": 1000,
    "completion_tokens": 1000,
    "total_tokens": 1000,
    "latency_ms": 1000,
    "from_cache": true,
    "provider": "...",
    "created_at": "2025-..."
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

### GET /ai/health
- Mô tả: Health & Monitoring
- Auth: không

- Response 200 (object `v1HealthCheckResponse`):

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
  "status": "..."
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

### GET /ai/providers/status
- Mô tả: Lấy thông tin
- Auth: không

- Response 200 (object `v1GetProviderStatusResponse`):

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
  "providers": [
    {
      "provider": "...",
      "status": "...",
      "success_rate": 1000,
      "avg_latency_ms": 1000,
      "circuit_breaker_state": "...",
      "last_check": "2025-..."
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

---

## Notes chung / Behaviour
- Server sử dụng in-memory stores (maps) cho dữ liệu. Dữ liệu sẽ mất khi server dừng.
- Một vài sample data có thể được seed sẵn để test.

---

End of spec.

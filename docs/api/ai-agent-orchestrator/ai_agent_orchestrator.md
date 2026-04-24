# Ai-Agent-Orchestrator Ai_Agent_Orchestrator API Specification

---

## Public endpoints

### POST /api/tasks/execute
- Mô tả: Gửi yêu cầu
- Auth: không
- Request JSON:

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "result": {
    "code": 1000,
    "message": "..."
  },
  "id": "...",
  "document_id": "...",
  "phases": [
    {
      "id": "...",
      "mode": "...",
      "steps": [
        {
          "id": "...",
          "skill_ref": "...",
          "document_id": "...",
          "feature_id": "...",
          "uc_id": "...",
          "meta": {},
          "per_feature": true,
          "per_uc": true
        }
      ]
    }
  ],
  "feature_ids": [
    "..."
  ],
  "uc_ids": [
    "..."
  ],
  "meta": {}
}
```

- Response 200 (object `v1RunTaskResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "result": {
    "code": 1000,
    "message": "..."
  },
  "plan_id": "...",
  "statuses": [
    {
      "step_id": "...",
      "skill_id": "...",
      "score": 1000.0,
      "blocked": true,
      "error": "...",
      "document": "..."
    }
  ],
  "blocked": true,
  "error": "...",
  "document": "..."
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

### POST /api/tasks/plan
- Mô tả: Gửi yêu cầu
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
  "document_id": "...",
  "goal": "...",
  "feature_ids": [
    "..."
  ],
  "uc_ids": [
    "..."
  ]
}
```

- Response 200 (object `v1ExecutionPlan`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "result": {
    "code": 1000,
    "message": "..."
  },
  "id": "...",
  "document_id": "...",
  "phases": [
    {
      "id": "...",
      "mode": "...",
      "steps": [
        {
          "id": "...",
          "skill_ref": "...",
          "document_id": "...",
          "feature_id": "...",
          "uc_id": "...",
          "meta": {},
          "per_feature": true,
          "per_uc": true
        }
      ]
    }
  ],
  "feature_ids": [
    "..."
  ],
  "uc_ids": [
    "..."
  ],
  "meta": {}
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

### POST /api/tasks/run
- Mô tả: Gửi yêu cầu
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
  "document_id": "...",
  "goal": "...",
  "feature_ids": [
    "..."
  ],
  "uc_ids": [
    "..."
  ],
  "meta": {}
}
```

- Response 200 (object `v1RunTaskResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "result": {
    "code": 1000,
    "message": "..."
  },
  "plan_id": "...",
  "statuses": [
    {
      "step_id": "...",
      "skill_id": "...",
      "score": 1000.0,
      "blocked": true,
      "error": "...",
      "document": "..."
    }
  ],
  "blocked": true,
  "error": "...",
  "document": "..."
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

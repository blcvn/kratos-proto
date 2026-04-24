# Ai-Agent-Executor Ai_Agent_Executor API Specification

---

## Public endpoints

### POST /api/execute/phase
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
  "phase_id": "...",
  "mode": "...",
  "steps": [
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
      "step_id": "...",
      "skill_ref": "...",
      "prompt_key": "...",
      "document_id": "...",
      "feature_id": "...",
      "uc_id": "...",
      "prd_text": "...",
      "meta": {}
    }
  ]
}
```

- Response 200 (object `v1PhaseResult`):

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
  "phase_id": "...",
  "step_results": [
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
      "step_id": "...",
      "score": 1000.0,
      "has_blocker": true,
      "blockers": [
        "..."
      ],
      "warnings": [
        "..."
      ],
      "meta": {}
    }
  ],
  "has_blocker": true
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

### POST /api/execute/step
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
  "step_id": "...",
  "skill_ref": "...",
  "prompt_key": "...",
  "document_id": "...",
  "feature_id": "...",
  "uc_id": "...",
  "prd_text": "...",
  "meta": {}
}
```

- Response 200 (object `v1StepResult`):

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
  "step_id": "...",
  "score": 1000.0,
  "has_blocker": true,
  "blockers": [
    "..."
  ],
  "warnings": [
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

### GET /api/skills
- Mô tả: Lấy thông tin
- Auth: không

- Response 200 (object `v1ListSkillsResponse`):

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
  "skills": [
    {
      "id": "...",
      "name": "...",
      "phase": "...",
      "prompt_key": "...",
      "version": "...",
      "enabled": true
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

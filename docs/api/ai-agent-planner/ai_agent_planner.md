# Ai-Agent-Planner Ai_Agent_Planner API Specification

---

## Public endpoints

### POST /api/plans
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
  "goal": "...",
  "feature_ids": [
    "..."
  ],
  "uc_ids": [
    "..."
  ],
  "phases": [
    {
      "id": "...",
      "name": "...",
      "mode": "...",
      "steps": [
        {
          "id": "...",
          "type": "...",
          "skill_ref": "...",
          "prompt_key": "...",
          "input_node_types": [
            "..."
          ],
          "output_node_types": [
            "..."
          ],
          "score_threshold": 1000.0,
          "max_attempts": 1000,
          "depends_on": [
            "..."
          ],
          "per_feature": true,
          "per_uc": true,
          "gate": {
            "gate_id": "...",
            "threshold": 1000.0,
            "hard_block": true
          },
          "meta": {}
        }
      ],
      "source_version": "...",
      "target_version": "..."
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

### POST /api/plans/validate
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
  "goal": "...",
  "feature_ids": [
    "..."
  ],
  "uc_ids": [
    "..."
  ],
  "phases": [
    {
      "id": "...",
      "name": "...",
      "mode": "...",
      "steps": [
        {
          "id": "...",
          "type": "...",
          "skill_ref": "...",
          "prompt_key": "...",
          "input_node_types": [
            "..."
          ],
          "output_node_types": [
            "..."
          ],
          "score_threshold": 1000.0,
          "max_attempts": 1000,
          "depends_on": [
            "..."
          ],
          "per_feature": true,
          "per_uc": true,
          "gate": {
            "gate_id": "...",
            "threshold": 1000.0,
            "hard_block": true
          },
          "meta": {}
        }
      ],
      "source_version": "...",
      "target_version": "..."
    }
  ]
}
```

- Response 200 (object `v1ValidationResult`):

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
  "valid": true,
  "errors": [
    "..."
  ],
  "warnings": [
    "..."
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

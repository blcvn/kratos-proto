# Ai-Agent-Registry Ai_Agent_Registry API Specification

---

## Public endpoints

### GET /api/config/agent
- Mô tả: Lấy thông tin
- Auth: không

- Response 200 (object `v1AgentConfig`):

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
  "version": "...",
  "prd_parse_mode": "...",
  "scoring_enabled": true,
  "qna_enabled": true,
  "enable_review_v5": true,
  "enable_reasoning_logic": true,
  "max_retries": 1000,
  "scoring_threshold": 1000.0
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

### GET /api/config/llm-temperature
- Mô tả: Lấy thông tin
- Auth: không

- Response 200 (object `v1LLMTemperatureConfig`):

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
  "default": 1000.0,
  "kg_enrich": 1000.0,
  "kg_scoring": 1000.0,
  "kg_patching": 1000.0,
  "doc_generation": 1000.0,
  "doc_scoring": 1000.0,
  "targeted_regen": 1000.0,
  "intent_classification": 1000.0,
  "section_extraction": 1000.0,
  "constrained_generation": 1000.0,
  "review_scoring": 1000.0,
  "qna_generation": 1000.0,
  "qna_answering": 1000.0,
  "prd_parsing": 1000.0,
  "normalization": 1000.0,
  "reasoning": 1000.0
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

### GET /api/config/template
- Mô tả: Lấy thông tin
- Auth: không

- Response 200 (object `v1TemplateConfig`):

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
  "version": "...",
  "tiers": {},
  "append_detail_to_overview": true
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

### GET /api/prompts/{key}
- Mô tả: Lấy thông tin theo `key`
- Auth: không

- Response 200 (object `v1PromptTemplate`):

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
  "key": "...",
  "tier": "...",
  "version": "...",
  "is_rl": true,
  "content": "..."
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

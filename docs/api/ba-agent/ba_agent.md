# Ba-Agent Ba_Agent API Specification

---

## Public endpoints

### POST /agent/execute
- Mô tả: Task Execution
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
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "max_iterations": 1000,
    "workflow_mode": "...",
    "history": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ]
  }
}
```

- Response 200 (object `v1ExecuteTaskResponse`):

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
  "task": {
    "id": "...",
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "status": "...",
    "steps": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ],
    "final_response": "...",
    "iterations_used": 1000,
    "created_at": "2025-...",
    "completed_at": "2025-...",
    "ref_id": "...",
    "modifications": [
      {
        "modify_type": "...",
        "start_index": 1000,
        "end_index": 1000,
        "content": "..."
      }
    ]
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

### POST /agent/execute/stream
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
  "payload": {
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "max_iterations": 1000,
    "workflow_mode": "...",
    "history": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ]
  }
}
```

- Response 200 (object):

```json
{
  "result": {
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
    "step": {
      "step_number": 1000,
      "thought": "...",
      "action": "...",
      "action_params": {},
      "observation": "...",
      "created_at": "2025-..."
    },
    "is_final": true
  },
  "error": {
    "code": 1000,
    "message": "...",
    "details": [
      {
        "@type": "..."
      }
    ]
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

### DELETE /agent/memory/{session_id}
- Mô tả: Xóa theo `session_id`
- Auth: không

- Response 200 (object `v1ClearMemoryResponse`):

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

### GET /agent/memory/{session_id}
- Mô tả: Memory theo `session_id`
- Auth: không

- Response 200 (object `v1GetMemoryResponse`):

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
  "memory": {
    "session_id": "...",
    "short_term": [
      "..."
    ],
    "long_term_ids": [
      "..."
    ]
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

### GET /agent/tasks/{task_id}
- Mô tả: Lấy thông tin theo `task_id`
- Auth: không

- Response 200 (object `v1GetTaskResponse`):

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
  "task": {
    "id": "...",
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "status": "...",
    "steps": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ],
    "final_response": "...",
    "iterations_used": 1000,
    "created_at": "2025-...",
    "completed_at": "2025-...",
    "ref_id": "...",
    "modifications": [
      {
        "modify_type": "...",
        "start_index": 1000,
        "end_index": 1000,
        "content": "..."
      }
    ]
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

### POST /agent/tasks/{task_id}/input
- Mô tả: Gửi yêu cầu theo `task_id`
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
  "input_data": "..."
}
```

- Response 200 (object):

```json
{
  "result": {
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
    "step": {
      "step_number": 1000,
      "thought": "...",
      "action": "...",
      "action_params": {},
      "observation": "...",
      "created_at": "2025-..."
    },
    "is_final": true
  },
  "error": {
    "code": 1000,
    "message": "...",
    "details": [
      {
        "@type": "..."
      }
    ]
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

### GET /agent/tools
- Mô tả: Tools
- Auth: không

- Response 200 (object `v1ListToolsResponse`):

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
  "tools": [
    {
      "name": "...",
      "description": "...",
      "input_schema": "..."
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

### POST /agent/v1/documents
- Mô tả: 3-Tier Workflow Orchestration
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
  "project_id": "...",
  "parent_document_id": "...",
  "tier": "...",
  "module_name": "...",
  "content": "..."
}
```

- Response 200 (object `v1GenerateRequirementResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "job_id": "...",
  "document_id": "..."
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

### POST /agent/v1/documents/approve
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
  "tier_id": "...",
  "parent_id": "...",
  "tier": "..."
}
```

- Response 200 (object `v1EmptyResponse`):

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

### POST /agent/v1/documents/detail
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
  "document_id": "..."
}
```

- Response 200 (object `v1ExecuteTaskResponse`):

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
  "task": {
    "id": "...",
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "status": "...",
    "steps": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ],
    "final_response": "...",
    "iterations_used": 1000,
    "created_at": "2025-...",
    "completed_at": "2025-...",
    "ref_id": "...",
    "modifications": [
      {
        "modify_type": "...",
        "start_index": 1000,
        "end_index": 1000,
        "content": "..."
      }
    ]
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

### POST /agent/v1/documents/editted
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
  "project_id": "...",
  "parent_document_id": "...",
  "tier": "...",
  "module_name": "...",
  "content": "..."
}
```

- Response 200 (object `v1EmptyResponse`):

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

### POST /agent/v1/documents/full
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
  "document_id": "..."
}
```

- Response 200 (object `v1ExecuteTaskResponse`):

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
  "task": {
    "id": "...",
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "status": "...",
    "steps": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ],
    "final_response": "...",
    "iterations_used": 1000,
    "created_at": "2025-...",
    "completed_at": "2025-...",
    "ref_id": "...",
    "modifications": [
      {
        "modify_type": "...",
        "start_index": 1000,
        "end_index": 1000,
        "content": "..."
      }
    ]
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

### POST /agent/v1/documents/index
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
  "document_id": "..."
}
```

- Response 200 (object `v1ExecuteTaskResponse`):

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
  "task": {
    "id": "...",
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "status": "...",
    "steps": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ],
    "final_response": "...",
    "iterations_used": 1000,
    "created_at": "2025-...",
    "completed_at": "2025-...",
    "ref_id": "...",
    "modifications": [
      {
        "modify_type": "...",
        "start_index": 1000,
        "end_index": 1000,
        "content": "..."
      }
    ]
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

### POST /agent/v1/documents/lineage
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
  "document_id": "..."
}
```

- Response 200 (object `v1EmptyResponse`):

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

### POST /agent/v1/documents/outline
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
  "document_id": "..."
}
```

- Response 200 (object `v1ExecuteTaskResponse`):

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
  "task": {
    "id": "...",
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "status": "...",
    "steps": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ],
    "final_response": "...",
    "iterations_used": 1000,
    "created_at": "2025-...",
    "completed_at": "2025-...",
    "ref_id": "...",
    "modifications": [
      {
        "modify_type": "...",
        "start_index": 1000,
        "end_index": 1000,
        "content": "..."
      }
    ]
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

### POST /agent/v1/documents/regenerate
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
  "project_id": "...",
  "parent_document_id": "...",
  "tier": "...",
  "module_name": "...",
  "content": "..."
}
```

- Response 200 (object `v1GenerateRequirementResponse`):

```json
{
  "metadata": {
    "request_id": "...",
    "request_time": "...",
    "version": "..."
  },
  "result": {
    "code": "...",
    "message": "..."
  },
  "job_id": "...",
  "document_id": "..."
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

### POST /agent/v1/documents/review
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
  "comment": "...",
  "action_type": "...",
  "affected_sections": "..."
}
```

- Response 200 (object `v1ExecuteTaskResponse`):

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
  "task": {
    "id": "...",
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "status": "...",
    "steps": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ],
    "final_response": "...",
    "iterations_used": 1000,
    "created_at": "2025-...",
    "completed_at": "2025-...",
    "ref_id": "...",
    "modifications": [
      {
        "modify_type": "...",
        "start_index": 1000,
        "end_index": 1000,
        "content": "..."
      }
    ]
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

### POST /agent/v1/documents/review/result
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
  "task_id": "..."
}
```

- Response 200 (object `v1GetTaskResponse`):

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
  "task": {
    "id": "...",
    "user_id": "...",
    "session_id": "...",
    "task_description": "...",
    "status": "...",
    "steps": [
      {
        "step_number": 1000,
        "thought": "...",
        "action": "...",
        "action_params": {},
        "observation": "...",
        "created_at": "2025-..."
      }
    ],
    "final_response": "...",
    "iterations_used": 1000,
    "created_at": "2025-...",
    "completed_at": "2025-...",
    "ref_id": "...",
    "modifications": [
      {
        "modify_type": "...",
        "start_index": 1000,
        "end_index": 1000,
        "content": "..."
      }
    ]
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

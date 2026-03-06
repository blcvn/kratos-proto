INSERT INTO permissions (id, tenant_id, "name", description, status, code, resource, "action", created_at)
VALUES
    -- ===========================================
    -- 1. AI Model Service
    -- ===========================================
    ('00000000-0000-0000-0000-000000000101'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Create Model', 'Create a new AI model', 1, 1, '/ai/models', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000102'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Model', 'Get AI model by ID', 1, 1, '/ai/models/{id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000103'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'List Models', 'List all AI models', 1, 1, '/ai/models', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000104'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Update Model', 'Update AI model', 1, 1, '/ai/models/{payload.id}', 'PUT', NOW()),
    ('00000000-0000-0000-0000-000000000105'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Delete Model', 'Delete AI model by ID', 1, 1, '/ai/models/{id}', 'DELETE', NOW()),
    ('00000000-0000-0000-0000-000000000106'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Usage Stats', 'Get AI model usage statistics', 1, 1, '/ai/models/stats', 'GET', NOW()),
    -- ===========================================
    -- 2. AI Proxy Service
    -- ===========================================
    ('00000000-0000-0000-0000-000000000201'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'AI Complete', 'AI completion request', 1, 1, '/ai/complete', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000202'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'AI Health Check', 'Check AI service health', 1, 1, '/ai/health', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000203'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Provider Status', 'Get AI provider status', 1, 1, '/ai/providers/status', 'GET', NOW()),
    -- ===========================================
    -- 3. Authentication Service
    -- ===========================================
    ('00000000-0000-0000-0000-000000000301'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Register', 'Register a new account', 1, 1, '/authen/register', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000302'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Login', 'Login to account', 1, 1, '/authen/login', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000303'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Login With Google', 'Login with Google OAuth', 1, 1, '/authen/login-with-google', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000304'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Logout', 'Logout from account', 1, 1, '/authen/logout', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000305'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Revoke Access Token', 'Revoke an access token', 1, 1, '/authen/revoke-access-token', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000306'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Revoke Refresh Token', 'Revoke a refresh token', 1, 1, '/authen/revoke-refresh-token', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000307'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Renew Access Token', 'Renew an access token', 1, 1, '/authen/renew-access-token', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000308'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Verify Token', 'Verify a token', 1, 1, '/authen/verify-token', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000309'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Assign Role', 'Assign role to user', 1, 1, '/user-role/assign-role', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000310'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Unassign Role', 'Unassign role from user', 1, 1, '/user-role/unassign-role', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000311'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Override Role', 'Override role for user', 1, 1, '/user-role/override-role', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000312'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'List Role', 'List user roles', 1, 1, '/user-role/list-role', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000313'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Active User', 'Activate a user', 1, 1, '/user-status/active', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000314'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Inactive User', 'Deactivate a user', 1, 1, '/user-status/unactive', 'POST', NOW()),
    -- ===========================================
    -- 4. Authorization Service
    -- ===========================================
    -- Tenant
    ('00000000-0000-0000-0000-000000000401'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Create Tenant', 'Create a new tenant', 1, 1, '/tenant/create', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000402'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Update Tenant', 'Update tenant', 1, 1, '/tenant/update', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000403'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Delete Tenant', 'Delete tenant', 1, 1, '/tenant/delete', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000404'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Tenant', 'Get tenant detail', 1, 1, '/tenant/get', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000405'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'List Tenant', 'List all tenants', 1, 1, '/tenant/list', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000406'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Search Tenant', 'Search tenants', 1, 1, '/tenant/search', 'POST', NOW()),
    -- Role
    ('00000000-0000-0000-0000-000000000407'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Create Role', 'Create a new role', 1, 1, '/role/create', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000408'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Update Role', 'Update role', 1, 1, '/role/update', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000409'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Delete Role', 'Delete role', 1, 1, '/role/delete', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000410'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Role', 'Get role detail', 1, 1, '/role/get', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000411'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'List Role', 'List all roles', 1, 1, '/role/list', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000412'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Search Role', 'Search roles', 1, 1, '/role/search', 'POST', NOW()),
    -- Permission
    ('00000000-0000-0000-0000-000000000413'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Create Permission', 'Create a new permission', 1, 1, '/permission/create', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000414'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Update Permission', 'Update permission', 1, 1, '/permission/update', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000415'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Delete Permission', 'Delete permission', 1, 1, '/permission/delete', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000416'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Permission', 'Get permission detail', 1, 1, '/permission/get', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000417'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'List Permission', 'List all permissions', 1, 1, '/permission/list', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000418'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Search Permission', 'Search permissions', 1, 1, '/permission/search', 'POST', NOW()),
    -- Role-Permission
    ('00000000-0000-0000-0000-000000000419'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Assign Permission', 'Assign permission to role', 1, 1, '/role-permission/assign', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000420'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Unassign Permission', 'Unassign permission from role', 1, 1, '/role-permission/unassign', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000421'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Override Permission', 'Override permissions for role', 1, 1, '/role-permission/override', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000422'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Search Role Permission', 'Search role permissions', 1, 1, '/role-permission/search', 'POST', NOW()),
    -- ===========================================
    -- 5. BA Agent Service
    -- ===========================================
    ('00000000-0000-0000-0000-000000000501'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Execute Task', 'Execute an agent task', 1, 1, '/agent/execute', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000502'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Task', 'Get agent task by ID', 1, 1, '/agent/tasks/{task_id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000503'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'List Tools', 'List available agent tools', 1, 1, '/agent/tools', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000504'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Memory', 'Get agent memory by session', 1, 1, '/agent/memory/{session_id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000505'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Clear Memory', 'Clear agent memory by session', 1, 1, '/agent/memory/{session_id}', 'DELETE', NOW()),
    ('00000000-0000-0000-0000-000000000506'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Submit Input', 'Submit input for agent task', 1, 1, '/agent/tasks/{task_id}/input', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000507'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Stream Execute Task', 'Stream execute an agent task', 1, 1, '/agent/execute/stream', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000508'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Generate Requirement', 'Generate requirement document', 1, 1, '/agent/v1/documents', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000509'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Document', 'Get document detail', 1, 1, '/agent/v1/documents/detail', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000510'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Tier Index', 'Get document tier index', 1, 1, '/agent/v1/documents/index', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000511'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Tier Outline', 'Get document tier outline', 1, 1, '/agent/v1/documents/outline', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000512'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Tier Full', 'Get document tier full', 1, 1, '/agent/v1/documents/full', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000513'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Approve Requirement', 'Approve requirement document', 1, 1, '/agent/v1/documents/approve', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000514'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Review Requirement', 'Review requirement document', 1, 1, '/agent/v1/documents/review', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000515'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Review Result', 'Get review result', 1, 1, '/agent/v1/documents/review/result', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000516'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Save Edited Document', 'Save edited document', 1, 1, '/agent/v1/documents/editted', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000517'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Regenerate Requirement', 'Regenerate requirement document', 1, 1, '/agent/v1/documents/regenerate', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000518'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Lineage', 'Get document lineage', 1, 1, '/agent/v1/documents/lineage', 'POST', NOW()),
    -- ===========================================
    -- 6. Feature Service
    -- ===========================================
    ('00000000-0000-0000-0000-000000000601'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Create Feature', 'Create a new feature', 1, 1, '/feature/create', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000602'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Update Feature', 'Update a feature', 1, 1, '/feature/update', 'PUT', NOW()),
    ('00000000-0000-0000-0000-000000000603'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Feature', 'Get feature by ID', 1, 1, '/feature/{id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000604'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'List Features', 'List all features', 1, 1, '/feature/list', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000605'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Delete Feature', 'Delete feature by ID', 1, 1, '/feature/{id}', 'DELETE', NOW()),
    -- ===========================================
    -- 7. Project Service
    -- ===========================================
    ('00000000-0000-0000-0000-000000000701'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Create Project', 'Create a new project', 1, 1, '/project/create', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000702'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Update Project', 'Update a project', 1, 1, '/project/update', 'PUT', NOW()),
    ('00000000-0000-0000-0000-000000000703'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'List Projects', 'List all projects', 1, 1, '/project/list', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000704'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Project', 'Get project by ID', 1, 1, '/project/{id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000705'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Delete Project', 'Delete project by ID', 1, 1, '/project/{id}', 'DELETE', NOW()),
    -- ===========================================
    -- 8. Prompt Service
    -- ===========================================
    ('00000000-0000-0000-0000-000000000801'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Create Template', 'Create a new prompt template', 1, 1, '/prompts/templates', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000802'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Template', 'Get prompt template by ID', 1, 1, '/prompts/templates/{id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000803'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'List Templates', 'List all prompt templates', 1, 1, '/prompts/templates', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000804'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Update Template', 'Update prompt template', 1, 1, '/prompts/templates/{payload.id}', 'PUT', NOW()),
    ('00000000-0000-0000-0000-000000000805'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Delete Template', 'Delete prompt template by ID', 1, 1, '/prompts/templates/{id}', 'DELETE', NOW()),
    ('00000000-0000-0000-0000-000000000806'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Render Template', 'Render a prompt template', 1, 1, '/prompts/render', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000807'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Create Experiment', 'Create a new experiment', 1, 1, '/prompts/experiments', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000808'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Experiment', 'Get experiment by ID', 1, 1, '/prompts/experiments/{id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000809'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Complete Experiment', 'Complete an experiment', 1, 1, '/prompts/experiments/{id}/complete', 'POST', NOW()),
    -- ===========================================
    -- 9. Session Service
    -- ===========================================
    ('00000000-0000-0000-0000-000000000901'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Create Session', 'Create a new session', 1, 1, '/session/create', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000000902'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Update Session', 'Update a session', 1, 1, '/session/update', 'PUT', NOW()),
    ('00000000-0000-0000-0000-000000000903'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Session', 'Get session by ID', 1, 1, '/session/{id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000000904'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'Get Session By Project', 'Get session by project ID', 1, 1, '/session/by-project/{project_id}', 'GET', NOW()),
    -- ===========================================
    -- 10. Workspace Service
    -- ===========================================
    -- Projects
    ('00000000-0000-0000-0000-000000001001'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Create Project', 'Create a new project', 1, 1, '/v1/workspace/projects', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000001002'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS List Projects', 'List all projects', 1, 1, '/v1/workspace/projects', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000001003'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Get Project', 'Get project by ID', 1, 1, '/v1/workspace/projects/{id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000001004'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Update Project', 'Update project by ID', 1, 1, '/v1/workspace/projects/{id}', 'PUT', NOW()),
    ('00000000-0000-0000-0000-000000001005'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Delete Project', 'Delete project by ID', 1, 1, '/v1/workspace/projects/{id}', 'DELETE', NOW()),
    -- Project Members
    ('00000000-0000-0000-0000-000000001006'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Add Project Member', 'Add a member to project', 1, 1, '/v1/workspace/projects/{project_id}/members', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000001007'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Remove Project Member', 'Remove a member from project', 1, 1, '/v1/workspace/projects/{project_id}/members/{user_id}', 'DELETE', NOW()),
    -- Features
    ('00000000-0000-0000-0000-000000001008'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Get Feature Tree', 'Get feature tree by project', 1, 1, '/v1/workspace/projects/{project_id}/features', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000001009'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Create Feature', 'Create a new feature', 1, 1, '/v1/workspace/projects/{project_id}/features', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000001010'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Create Feature Group', 'Create a new feature group', 1, 1, '/v1/workspace/projects/{project_id}/feature-groups', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000001011'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Get Feature', 'Get feature by ID', 1, 1, '/v1/workspace/features/{id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000001012'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Update Feature', 'Update feature by ID', 1, 1, '/v1/workspace/features/{id}', 'PUT', NOW()),
    ('00000000-0000-0000-0000-000000001013'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Delete Feature', 'Delete feature by ID', 1, 1, '/v1/workspace/features/{id}', 'DELETE', NOW()),
    -- Documents
    ('00000000-0000-0000-0000-000000001014'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Create Document', 'Create a new document', 1, 1, '/v1/workspace/features/{feature_id}/documents', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000001015'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS List Documents', 'List documents by feature', 1, 1, '/v1/workspace/features/{feature_id}/documents', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000001016'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS List Document Sections', 'List sections of a document', 1, 1, '/v1/workspace/documents/{document_id}/sections', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000001017'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Get Document Section', 'Get document section by ID', 1, 1, '/v1/workspace/document-sections/{id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000001018'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Create Document Section', 'Create a new document section', 1, 1, '/v1/workspace/documents/{document_id}/sections', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000001019'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Update Document Section', 'Update document section by ID', 1, 1, '/v1/workspace/document-sections/{id}', 'PUT', NOW()),
    ('00000000-0000-0000-0000-000000001020'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Update Doc Section Content', 'Update document section content', 1, 1, '/v1/workspace/document-sections/{id}/content', 'PUT', NOW()),
    -- Chat History
    ('00000000-0000-0000-0000-000000001021'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS List Chat Messages', 'List chat messages by feature', 1, 1, '/v1/workspace/features/{feature_id}/chat', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000001022'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Append Chat Message', 'Append a chat message', 1, 1, '/v1/workspace/features/{feature_id}/chat', 'POST', NOW()),
    -- Sessions
    ('00000000-0000-0000-0000-000000001023'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Create Session', 'Create a new session', 1, 1, '/v1/workspace/projects/{project_id}/sessions', 'POST', NOW()),
    ('00000000-0000-0000-0000-000000001024'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Update Session Context', 'Update session context', 1, 1, '/v1/workspace/sessions/{id}/context', 'PUT', NOW()),
    ('00000000-0000-0000-0000-000000001025'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Get Session', 'Get session by ID', 1, 1, '/v1/workspace/sessions/{id}', 'GET', NOW()),
    ('00000000-0000-0000-0000-000000001026'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS List Project Sessions', 'List sessions by project', 1, 1, '/v1/workspace/projects/{project_id}/sessions', 'GET', NOW()),
    -- /agent/v2/documents/stream
    ('00000000-0000-0000-0000-000000001027'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Stream Document', 'Stream document content', 1, 1, '/agent/v2/documents/stream', 'POST', NOW()),
    -- /agent/v2/documents/approve/stream
    ('00000000-0000-0000-0000-000000001028'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Stream Approve Document', 'Stream approve document result', 1, 1, '/agent/v2/documents/approve/stream', 'POST', NOW()),
    -- /agent/v2/documents/review/stream
    ('00000000-0000-0000-0000-000000001029'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Stream Review Document', 'Stream review document result', 1, 1, '/agent/v2/documents/review/stream', 'POST', NOW()),
    -- /agent/v1/sse
    ('00000000-0000-0000-0000-000000001030'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Stream SSE', 'Stream SSE content', 1, 1, '/agent/v1/sse', 'GET', NOW()),
    -- /agent/v1/documents/prd:upload
    ('00000000-0000-0000-0000-000000001031'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Upload PRD', 'Upload PRD document', 1, 1, '/agent/v1/documents/prd:upload', 'POST', NOW()),
    -- /api/v3/documents/prd/upload/stream
    ('00000000-0000-0000-0000-000000001032'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Stream Upload PRD', 'Stream upload PRD document result', 1, 1, '/agent/v1/documents/prd:upload/stream', 'POST', NOW()),
    -- /api/v3/documents/prd/upload/status
    ('00000000-0000-0000-0000-000000001033'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Get Upload PRD Status', 'Get upload PRD document status', 1, 1, '/agent/v1/documents/prd:upload/status', 'GET', NOW()),
    -- /api/v3/documents/prd/upload
    ('00000000-0000-0000-0000-000000001034'::uuid, 'ba000000-0000-0000-0000-000000000001'::uuid, 'WS Cancel Upload PRD', 'Cancel upload PRD document', 1, 1, '/agent/v1/documents/prd:upload/cancel', 'DELETE', NOW())
ON CONFLICT (id) DO NOTHING;

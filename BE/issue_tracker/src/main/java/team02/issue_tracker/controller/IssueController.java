package team02.issue_tracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team02.issue_tracker.dto.wrapping_dto.DataResponse;
import team02.issue_tracker.dto.wrapping_dto.ListDataResponse;
import team02.issue_tracker.service.IssueService;

@RestController
@RequestMapping("/api/issues")
public class IssueController {

    private IssueService issueService;

    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping
    public ListDataResponse showAllIssues() {
        return issueService.getAllIssueResponses();
    }

    @GetMapping("/{issueId}")
    public DataResponse showDetailIssue(@PathVariable Long issueId) {
        return issueService.getDetailIssueResponse(issueId);
    }
}

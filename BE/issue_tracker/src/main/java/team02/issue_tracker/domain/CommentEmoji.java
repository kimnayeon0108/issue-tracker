package team02.issue_tracker.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import team02.issue_tracker.domain.composite_key.CommentEmojiId;

import javax.persistence.*;

@IdClass(CommentEmojiId.class)
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CommentEmoji {
    @Id
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_comment_emoji_comment1"))
    private Comment comment;

    @Id
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_comment_emoji_emoji1"))
    private Emoji emoji;
}

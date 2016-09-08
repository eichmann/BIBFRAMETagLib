package edu.uiowa.slis.BIBFRAME.EditorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorContributionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EditorContributionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorContributionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EditorContribution theEditorContribution = (EditorContribution)findAncestorWithClass(this, EditorContribution.class);
			if (!theEditorContribution.commitNeeded) {
				pageContext.getOut().print(theEditorContribution.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EditorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorContribution for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			EditorContribution theEditorContribution = (EditorContribution)findAncestorWithClass(this, EditorContribution.class);
			return theEditorContribution.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing EditorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorContribution for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			EditorContribution theEditorContribution = (EditorContribution)findAncestorWithClass(this, EditorContribution.class);
			theEditorContribution.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing EditorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorContribution for label tag ");
		}
	}
}


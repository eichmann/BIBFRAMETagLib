package edu.uiowa.slis.BIBFRAME.EditorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorContributionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static EditorContributionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorContributionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EditorContribution theEditorContribution = (EditorContribution)findAncestorWithClass(this, EditorContribution.class);
			if (!theEditorContribution.commitNeeded) {
				pageContext.getOut().print(theEditorContribution.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EditorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorContribution for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			EditorContribution theEditorContribution = (EditorContribution)findAncestorWithClass(this, EditorContribution.class);
			return theEditorContribution.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing EditorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorContribution for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			EditorContribution theEditorContribution = (EditorContribution)findAncestorWithClass(this, EditorContribution.class);
			theEditorContribution.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing EditorContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorContribution for subjectURI tag ");
		}
	}
}


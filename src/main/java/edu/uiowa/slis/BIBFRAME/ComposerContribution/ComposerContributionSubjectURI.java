package edu.uiowa.slis.BIBFRAME.ComposerContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ComposerContributionSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ComposerContributionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ComposerContributionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ComposerContribution theComposerContribution = (ComposerContribution)findAncestorWithClass(this, ComposerContribution.class);
			if (!theComposerContribution.commitNeeded) {
				pageContext.getOut().print(theComposerContribution.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ComposerContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ComposerContribution for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ComposerContribution theComposerContribution = (ComposerContribution)findAncestorWithClass(this, ComposerContribution.class);
			return theComposerContribution.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ComposerContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ComposerContribution for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ComposerContribution theComposerContribution = (ComposerContribution)findAncestorWithClass(this, ComposerContribution.class);
			theComposerContribution.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ComposerContribution for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ComposerContribution for subjectURI tag ");
		}
	}
}


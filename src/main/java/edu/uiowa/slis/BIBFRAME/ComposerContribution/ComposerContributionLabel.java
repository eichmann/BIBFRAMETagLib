package edu.uiowa.slis.BIBFRAME.ComposerContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ComposerContributionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ComposerContributionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ComposerContributionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ComposerContribution theComposerContribution = (ComposerContribution)findAncestorWithClass(this, ComposerContribution.class);
			if (!theComposerContribution.commitNeeded) {
				pageContext.getOut().print(theComposerContribution.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ComposerContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ComposerContribution for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ComposerContribution theComposerContribution = (ComposerContribution)findAncestorWithClass(this, ComposerContribution.class);
			return theComposerContribution.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ComposerContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ComposerContribution for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ComposerContribution theComposerContribution = (ComposerContribution)findAncestorWithClass(this, ComposerContribution.class);
			theComposerContribution.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ComposerContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ComposerContribution for label tag ");
		}
	}
}


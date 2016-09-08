package edu.uiowa.slis.BIBFRAME.PerformerContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PerformerContributionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PerformerContributionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PerformerContributionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PerformerContribution thePerformerContribution = (PerformerContribution)findAncestorWithClass(this, PerformerContribution.class);
			if (!thePerformerContribution.commitNeeded) {
				pageContext.getOut().print(thePerformerContribution.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PerformerContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PerformerContribution for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PerformerContribution thePerformerContribution = (PerformerContribution)findAncestorWithClass(this, PerformerContribution.class);
			return thePerformerContribution.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PerformerContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PerformerContribution for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PerformerContribution thePerformerContribution = (PerformerContribution)findAncestorWithClass(this, PerformerContribution.class);
			thePerformerContribution.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PerformerContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PerformerContribution for label tag ");
		}
	}
}


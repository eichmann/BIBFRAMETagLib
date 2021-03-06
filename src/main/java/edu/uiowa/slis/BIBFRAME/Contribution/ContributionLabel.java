package edu.uiowa.slis.BIBFRAME.Contribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContributionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContributionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ContributionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Contribution theContribution = (Contribution)findAncestorWithClass(this, Contribution.class);
			if (!theContribution.commitNeeded) {
				pageContext.getOut().print(theContribution.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Contribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contribution for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Contribution theContribution = (Contribution)findAncestorWithClass(this, Contribution.class);
			return theContribution.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Contribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contribution for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Contribution theContribution = (Contribution)findAncestorWithClass(this, Contribution.class);
			theContribution.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Contribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Contribution for label tag ");
		}
	}
}


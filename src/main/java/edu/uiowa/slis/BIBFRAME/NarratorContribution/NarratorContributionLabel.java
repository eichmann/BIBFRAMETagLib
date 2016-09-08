package edu.uiowa.slis.BIBFRAME.NarratorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NarratorContributionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NarratorContributionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NarratorContributionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			NarratorContribution theNarratorContribution = (NarratorContribution)findAncestorWithClass(this, NarratorContribution.class);
			if (!theNarratorContribution.commitNeeded) {
				pageContext.getOut().print(theNarratorContribution.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing NarratorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NarratorContribution for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			NarratorContribution theNarratorContribution = (NarratorContribution)findAncestorWithClass(this, NarratorContribution.class);
			return theNarratorContribution.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing NarratorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NarratorContribution for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			NarratorContribution theNarratorContribution = (NarratorContribution)findAncestorWithClass(this, NarratorContribution.class);
			theNarratorContribution.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing NarratorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing NarratorContribution for label tag ");
		}
	}
}


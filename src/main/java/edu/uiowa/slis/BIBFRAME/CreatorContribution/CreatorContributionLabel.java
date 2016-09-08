package edu.uiowa.slis.BIBFRAME.CreatorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CreatorContributionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static CreatorContributionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CreatorContributionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CreatorContribution theCreatorContribution = (CreatorContribution)findAncestorWithClass(this, CreatorContribution.class);
			if (!theCreatorContribution.commitNeeded) {
				pageContext.getOut().print(theCreatorContribution.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CreatorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CreatorContribution for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			CreatorContribution theCreatorContribution = (CreatorContribution)findAncestorWithClass(this, CreatorContribution.class);
			return theCreatorContribution.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing CreatorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CreatorContribution for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			CreatorContribution theCreatorContribution = (CreatorContribution)findAncestorWithClass(this, CreatorContribution.class);
			theCreatorContribution.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing CreatorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing CreatorContribution for label tag ");
		}
	}
}


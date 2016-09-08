package edu.uiowa.slis.BIBFRAME.ConductorContribution;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConductorContributionLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ConductorContributionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ConductorContributionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConductorContribution theConductorContribution = (ConductorContribution)findAncestorWithClass(this, ConductorContribution.class);
			if (!theConductorContribution.commitNeeded) {
				pageContext.getOut().print(theConductorContribution.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConductorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConductorContribution for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ConductorContribution theConductorContribution = (ConductorContribution)findAncestorWithClass(this, ConductorContribution.class);
			return theConductorContribution.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConductorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConductorContribution for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ConductorContribution theConductorContribution = (ConductorContribution)findAncestorWithClass(this, ConductorContribution.class);
			theConductorContribution.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ConductorContribution for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConductorContribution for label tag ");
		}
	}
}


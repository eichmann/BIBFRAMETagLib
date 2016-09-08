package edu.uiowa.slis.BIBFRAME.DistinctiveTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DistinctiveTitleLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DistinctiveTitleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DistinctiveTitleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DistinctiveTitle theDistinctiveTitle = (DistinctiveTitle)findAncestorWithClass(this, DistinctiveTitle.class);
			if (!theDistinctiveTitle.commitNeeded) {
				pageContext.getOut().print(theDistinctiveTitle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DistinctiveTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			DistinctiveTitle theDistinctiveTitle = (DistinctiveTitle)findAncestorWithClass(this, DistinctiveTitle.class);
			return theDistinctiveTitle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing DistinctiveTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			DistinctiveTitle theDistinctiveTitle = (DistinctiveTitle)findAncestorWithClass(this, DistinctiveTitle.class);
			theDistinctiveTitle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing DistinctiveTitle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DistinctiveTitle for label tag ");
		}
	}
}


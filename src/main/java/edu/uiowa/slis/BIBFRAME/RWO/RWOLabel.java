package edu.uiowa.slis.BIBFRAME.RWO;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RWOLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static RWOLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(RWOLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			RWO theRWO = (RWO)findAncestorWithClass(this, RWO.class);
			if (!theRWO.commitNeeded) {
				pageContext.getOut().print(theRWO.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			RWO theRWO = (RWO)findAncestorWithClass(this, RWO.class);
			return theRWO.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing RWO for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			RWO theRWO = (RWO)findAncestorWithClass(this, RWO.class);
			theRWO.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing RWO for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RWO for label tag ");
		}
	}
}


package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileLabel extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Tactile theTactile = (Tactile)findAncestorWithClass(this, Tactile.class);
			if (!theTactile.commitNeeded) {
				pageContext.getOut().print(theTactile.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Tactile theTactile = (Tactile)findAncestorWithClass(this, Tactile.class);
			return theTactile.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Tactile for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Tactile theTactile = (Tactile)findAncestorWithClass(this, Tactile.class);
			theTactile.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for label tag ");
		}
	}
}


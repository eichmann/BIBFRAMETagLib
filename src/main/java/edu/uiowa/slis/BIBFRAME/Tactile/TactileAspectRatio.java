package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileAspectRatio extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileAspectRatio currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileAspectRatio.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Tactile theTactile = (Tactile)findAncestorWithClass(this, Tactile.class);
			if (!theTactile.commitNeeded) {
				pageContext.getOut().print(theTactile.getAspectRatio());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for aspectRatio tag ");
		}
		return SKIP_BODY;
	}

	public String getAspectRatio() throws JspTagException {
		try {
			Tactile theTactile = (Tactile)findAncestorWithClass(this, Tactile.class);
			return theTactile.getAspectRatio();
		} catch (Exception e) {
			log.error(" Can't find enclosing Tactile for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for aspectRatio tag ");
		}
	}

	public void setAspectRatio(String aspectRatio) throws JspTagException {
		try {
			Tactile theTactile = (Tactile)findAncestorWithClass(this, Tactile.class);
			theTactile.setAspectRatio(aspectRatio);
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for aspectRatio tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for aspectRatio tag ");
		}
	}
}


package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasProvision extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasProvision currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasProvision.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasProvisionIterator theTactileHasProvisionIterator = (TactileHasProvisionIterator)findAncestorWithClass(this, TactileHasProvisionIterator.class);
			pageContext.getOut().print(theTactileHasProvisionIterator.getHasProvision());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasProvision tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasProvision tag ");
		}
		return SKIP_BODY;
	}
}


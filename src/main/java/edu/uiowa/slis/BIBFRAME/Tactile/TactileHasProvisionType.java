package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileHasProvisionType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileHasProvisionType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileHasProvisionType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileHasProvisionIterator theTactileHasProvisionIterator = (TactileHasProvisionIterator)findAncestorWithClass(this, TactileHasProvisionIterator.class);
			pageContext.getOut().print(theTactileHasProvisionIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for hasProvision tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for hasProvision tag ");
		}
		return SKIP_BODY;
	}
}


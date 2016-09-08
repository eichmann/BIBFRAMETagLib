package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileIdentifiedByIterator theTactileIdentifiedByIterator = (TactileIdentifiedByIterator)findAncestorWithClass(this, TactileIdentifiedByIterator.class);
			pageContext.getOut().print(theTactileIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}


package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileEquivalentTo extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileEquivalentTo currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileEquivalentTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileEquivalentToIterator theTactileEquivalentToIterator = (TactileEquivalentToIterator)findAncestorWithClass(this, TactileEquivalentToIterator.class);
			pageContext.getOut().print(theTactileEquivalentToIterator.getEquivalentTo());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for equivalentTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for equivalentTo tag ");
		}
		return SKIP_BODY;
	}
}


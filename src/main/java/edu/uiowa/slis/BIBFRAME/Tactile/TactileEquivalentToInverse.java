package edu.uiowa.slis.BIBFRAME.Tactile;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TactileEquivalentToInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static TactileEquivalentToInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(TactileEquivalentToInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TactileEquivalentToInverseIterator theTactileEquivalentToInverseIterator = (TactileEquivalentToInverseIterator)findAncestorWithClass(this, TactileEquivalentToInverseIterator.class);
			pageContext.getOut().print(theTactileEquivalentToInverseIterator.getEquivalentToInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Tactile for equivalentTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Tactile for equivalentTo tag ");
		}
		return SKIP_BODY;
	}
}


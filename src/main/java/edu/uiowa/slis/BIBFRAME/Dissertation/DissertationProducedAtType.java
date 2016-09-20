package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationProducedAtIterator theDissertationProducedAtIterator = (DissertationProducedAtIterator)findAncestorWithClass(this, DissertationProducedAtIterator.class);
			pageContext.getOut().print(theDissertationProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for producedAt tag ");
		}
		return SKIP_BODY;
	}
}


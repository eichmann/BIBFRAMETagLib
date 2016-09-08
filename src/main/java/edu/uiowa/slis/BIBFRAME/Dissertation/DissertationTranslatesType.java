package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationTranslatesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationTranslatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationTranslatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationTranslatesIterator theDissertationTranslatesIterator = (DissertationTranslatesIterator)findAncestorWithClass(this, DissertationTranslatesIterator.class);
			pageContext.getOut().print(theDissertationTranslatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for translates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for translates tag ");
		}
		return SKIP_BODY;
	}
}


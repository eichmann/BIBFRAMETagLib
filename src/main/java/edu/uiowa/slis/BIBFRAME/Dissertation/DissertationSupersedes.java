package edu.uiowa.slis.BIBFRAME.Dissertation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DissertationSupersedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static DissertationSupersedes currentInstance = null;
	private static final Log log = LogFactory.getLog(DissertationSupersedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DissertationSupersedesIterator theDissertationSupersedesIterator = (DissertationSupersedesIterator)findAncestorWithClass(this, DissertationSupersedesIterator.class);
			pageContext.getOut().print(theDissertationSupersedesIterator.getSupersedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Dissertation for supersedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dissertation for supersedes tag ");
		}
		return SKIP_BODY;
	}
}

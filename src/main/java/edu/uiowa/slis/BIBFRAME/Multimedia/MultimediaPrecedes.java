package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaPrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaPrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaPrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaPrecedesIterator theMultimediaPrecedesIterator = (MultimediaPrecedesIterator)findAncestorWithClass(this, MultimediaPrecedesIterator.class);
			pageContext.getOut().print(theMultimediaPrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for precedes tag ");
		}
		return SKIP_BODY;
	}
}


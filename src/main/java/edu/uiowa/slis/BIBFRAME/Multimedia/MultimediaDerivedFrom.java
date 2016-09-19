package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaDerivedFromIterator theMultimediaDerivedFromIterator = (MultimediaDerivedFromIterator)findAncestorWithClass(this, MultimediaDerivedFromIterator.class);
			pageContext.getOut().print(theMultimediaDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}


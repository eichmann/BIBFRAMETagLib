package edu.uiowa.slis.BIBFRAME.Print;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PrintHasCoverArtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static PrintHasCoverArtType currentInstance = null;
	private static final Log log = LogFactory.getLog(PrintHasCoverArtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PrintHasCoverArtIterator thePrintHasCoverArtIterator = (PrintHasCoverArtIterator)findAncestorWithClass(this, PrintHasCoverArtIterator.class);
			pageContext.getOut().print(thePrintHasCoverArtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Print for hasCoverArt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Print for hasCoverArt tag ");
		}
		return SKIP_BODY;
	}
}


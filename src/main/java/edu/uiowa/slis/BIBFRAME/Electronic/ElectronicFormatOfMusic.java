package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicFormatOfMusic extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicFormatOfMusic currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicFormatOfMusic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ElectronicFormatOfMusicIterator theElectronic = (ElectronicFormatOfMusicIterator)findAncestorWithClass(this, ElectronicFormatOfMusicIterator.class);
			pageContext.getOut().print(theElectronic.getFormatOfMusic());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for formatOfMusic tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for formatOfMusic tag ");
		}
		return SKIP_BODY;
	}
}


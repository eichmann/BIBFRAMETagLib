package edu.uiowa.slis.BIBFRAME.Electronic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ElectronicHasCoverArt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ElectronicHasCoverArt currentInstance = null;
	private static final Log log = LogFactory.getLog(ElectronicHasCoverArt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ElectronicHasCoverArtIterator theElectronicHasCoverArtIterator = (ElectronicHasCoverArtIterator)findAncestorWithClass(this, ElectronicHasCoverArtIterator.class);
			pageContext.getOut().print(theElectronicHasCoverArtIterator.getHasCoverArt());
		} catch (Exception e) {
			log.error("Can't find enclosing Electronic for hasCoverArt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Electronic for hasCoverArt tag ");
		}
		return SKIP_BODY;
	}
}


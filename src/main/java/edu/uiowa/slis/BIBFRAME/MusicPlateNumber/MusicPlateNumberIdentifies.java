package edu.uiowa.slis.BIBFRAME.MusicPlateNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MusicPlateNumberIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MusicPlateNumberIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(MusicPlateNumberIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MusicPlateNumberIdentifiesIterator theMusicPlateNumberIdentifiesIterator = (MusicPlateNumberIdentifiesIterator)findAncestorWithClass(this, MusicPlateNumberIdentifiesIterator.class);
			pageContext.getOut().print(theMusicPlateNumberIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing MusicPlateNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing MusicPlateNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

